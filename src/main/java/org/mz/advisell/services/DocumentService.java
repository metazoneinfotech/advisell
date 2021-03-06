/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.advisell.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mz.advisell.bean.Document;

/**
 *
 * @author parii
 */
public class DocumentService {

    private static final Logger LOGGER = LogManager.getLogger(DocumentService.class.getName());

    public int uploadDocuments(ArrayList<Document> documentList, String aadhar) {
        File directory = new File("documents/" + aadhar);
        directory.mkdirs();
        int result=uploadDocuments(documentList, directory);
        if(result==1){
            LOGGER.info(documentList.size()+" Documents uploaded");
        }
        return result;
    }

    public int resetDocuments(ArrayList<Document> documentList, String aadhar) {
        int result = 1;
        //Upload to temp
        File tempDir = new File("documents/" + aadhar + "/temp");
        tempDir.mkdirs();
        result = result & uploadDocuments(documentList, tempDir);

        //delete from adhar folder
        result = result & deleteDocuments(aadhar);

        //upload from temp to adhar
        documentList = new ArrayList<Document>();
        if (tempDir.listFiles()!=null) {
            for (File file : tempDir.listFiles()) {
                Document document = new Document();
                document.setFile(file);
                document.setFileName(file.getName());
                documentList.add(document);
            }
        }

        result = result & uploadDocuments(documentList, new File("documents/" + aadhar));

        //delete temp docs
        result = result & deleteDocuments(aadhar + "/temp");
        if(result==1){
            LOGGER.info(documentList.size()+" Documents uploaded");
        }
        return result;
    }

    public int deleteDocuments(String aadhar) {
        File directory = new File("documents/" + aadhar);
        File[] fileArray = directory.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                file.delete();
            }
        }
        directory.delete();
        return 1;
    }

    private int uploadDocuments(ArrayList<Document> documentList, File directory) {
        int result = 0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        File file;
        try {
            for (Document document : documentList) {
                file = new File(directory + File.separator + document.getFileName());
                fileInputStream = new FileInputStream(document.getFile());
                fileOutputStream = new FileOutputStream(file);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fileInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, length);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            result = 1;
        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

        return result;
    }
}
