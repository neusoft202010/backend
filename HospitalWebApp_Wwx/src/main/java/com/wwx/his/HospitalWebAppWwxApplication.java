package com.wwx.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.oa.admin.mapper","com.neusoft.oa.pst.mapper","com.neusoft.oa.cd.mapper","com.neusoft.oa.drug.mapper"})
public class HospitalWebAppWwxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalWebAppWwxApplication.class, args);
	}

}
