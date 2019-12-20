package com.banli114.cms.test;

import ch.qos.logback.classic.Logger;
import cn.hutool.core.lang.Console;
import com.banli114.cms.utils.DatabaseHelper;

import java.sql.SQLException;

/**
 * @author JRong
 * @version V1.0
 * @Package com.banli114.cms.test
 * @date 2019/12/19 14:07
 */
public class Test1 {

    public static void main(String[] args) {
        DatabaseHelper db = new DatabaseHelper();
        try {
            String rs = db.queryColumn("select user_name from bl_user_tab", "user_name");
            Console.log(rs);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
