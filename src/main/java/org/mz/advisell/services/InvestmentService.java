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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mz.advisell.bean.Investment;
import org.mz.advisell.services.dao.DBConnection;

/**
 *
 * @author metazone
 */
public class InvestmentService{

    private Connection connection;
    private static final Logger LOGGER=LogManager.getLogger(InvestmentService.class.getName());
    
    public int addInvestment(Investment investment, String aadhar) {
        DBConnection dbConnection = new DBConnection();
	PreparedStatement statement=null;
        int result = 0;
	try{
            connection = dbConnection.createConnection();
            statement=connection.prepareStatement("INSERT INTO investment(aadhar,scheme_name,amount) VALUES(?,?,?);");
            statement.setString(1,aadhar);
            statement.setString(2,investment.getScheme());
            statement.setInt(3,investment.getAmount());
            result=statement.executeUpdate();
            if(result==1){
                LOGGER.info("Client which have "+aadhar+" aadharnumber make investment "+investment.getScheme()+" scheme");
            }
	}catch(SQLException e){	
            LOGGER.error(e.getMessage(),e);
	}finally{
            try {
                if(statement!=null){
                    statement.close();
		}
            }catch (SQLException e) {
               LOGGER.error(e.getMessage(),e);
            }
            dbConnection.closeConnection();
	}
	return result;   
    }
    
    public ArrayList<Investment> getInvestmentList(String aadhar){
        DBConnection dbConnection = new DBConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<Investment> investmentList = new ArrayList<Investment>();
        try{
            connection = dbConnection.createConnection();
            statement=connection.prepareStatement("SELECT * FROM investment WHERE aadhar=?");
            statement.setString(1,aadhar);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Investment investment = new Investment();
                investment.setScheme(resultSet.getString("scheme_name"));
                investment.setAmount(resultSet.getInt("amount"));
                investmentList.add(investment);
            }
	}catch(SQLException e){
            LOGGER.error(e.getMessage(),e);
	}finally{
            try {
                if(statement!=null){
                    statement.close();
		}
                if(resultSet!=null){
                    resultSet.close();
                }
            }catch (SQLException e) {
                LOGGER.error(e.getMessage(),e);
            }
            dbConnection.closeConnection();
	}
	return investmentList;   
    }
    
}
