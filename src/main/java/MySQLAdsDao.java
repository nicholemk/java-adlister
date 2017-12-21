import java.sql.*;
package com.codeup.lister.dao.models;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class MySQLAdsDao implements Ads {
        private connection connection =  null;

        public MySQLAdsDao(Config config) {
            try {
                DriverManager.registerDriver(new Driver());
            }
        }
}
