package com.wwx.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.wwx.his.admin.mapper","com.wwx.his.pst.mapper","com.wwx.his.cd.mapper","com.wwx.his.drug.mapper"})
public class HospitalWebAppWwxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalWebAppWwxApplication.class, args);
	}

}
