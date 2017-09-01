/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mz.irt.bo.profile;

import java.util.ArrayList;
import org.mz.irt.model.Profile;
import org.mz.irt.dao.profile.ProfileDao;
import org.mz.irt.dao.profile.ProfileDaoImp1;
import org.mz.irt.model.Document;

/**
 *
 * @author metazone
 */
public class ProfileBoImp1 implements ProfileBo{

    @Override
    public int createProfile(Profile profile) {
      ProfileDao profileDao=new ProfileDaoImp1();
      return profileDao.addProfile(profile);  
    }

    @Override
    public int updateProfile(Profile profile,ArrayList<Document> deleteDocumentlist) {
      ProfileDao profileDao=new ProfileDaoImp1();
      return profileDao.updateProfile(profile,deleteDocumentlist);    
    }
    
    @Override
    public int deleteProfile(String aadharCardNo) {
      ProfileDao profileDao=new ProfileDaoImp1();
      return profileDao.deleteProfile(aadharCardNo);    
    }
}
