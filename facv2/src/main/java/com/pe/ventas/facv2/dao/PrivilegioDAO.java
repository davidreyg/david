/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.ventas.facv2.dao;

import java.util.ArrayList;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Leandro Burgos
 */
public class PrivilegioDAO {

    String sql;

    private JdbcTemplate jt;

    public PrivilegioDAO(DataSource dataSource) {
        jt = new JdbcTemplate(dataSource);
    }
    
    
    public ArrayList<Map<String, Object>> listarURLs(String idrol, String id_modulo) {
        sql = "select * from  VISTA_PRIVILEGIOS where ID_ROL='" + idrol + "' and id_modulo='" + id_modulo + "' ";
        return (ArrayList<Map<String, Object>>) jt.queryForList(sql);
    }
}
