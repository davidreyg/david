package com.pe.ventas.facv2.config;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pe.ventas.facv2.dao.RolDAO;
import com.pe.ventas.facv2.dao.UsuarioDAO;
import com.pe.ventas.facv2.dto.CustomUser;

@Service("userDetailsService")
@Transactional(readOnly=true)
public class UserDetailsServiceImpl implements UserDetailsService {
	private UsuarioDAO ud=new UsuarioDAO(AppConfig.getDataSource());
	private RolDAO rd=new RolDAO(AppConfig.getDataSource());
	
    public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Map<String, Object> userinfo=ud.getByUserName(username);
		CustomUser user=new CustomUser(userinfo,rd.List_Modulos(userinfo.get("ID_ROL")),
				true,true,true,true);
		System.out.println("loadByUsername is running");
		System.out.println(rd.List_Modulos(userinfo.get("ID_ROL")));
		return user;
	}

}
