package cn.springboot_themeleaf_jpa;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.druid.pool.DruidDataSource;

@SuppressWarnings("deprecation")
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter{
	//要读取配置文件内容，则通过Environment这个变量实例化对象自动读取，我们要自动注入该对象
		@Autowired
		private Environment env;
		
		//配置数据源
		@Bean(name="dataSource",destroyMethod="close")
		public DataSource getDataSource() {
			DruidDataSource ds=new DruidDataSource();
			//我们要读取配置文件对于数据源的信息配置
			ds.setUrl(env.getProperty("spring.datasource.url").trim());
			ds.setUsername(env.getProperty("spring.datasource.username").trim());
			ds.setPassword(env.getProperty("spring.datasource.password").trim());
			ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name").trim());;
			return ds;
		}
}
