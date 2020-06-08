package com.qxc.hotel.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {
	private static MybatisPlusGenerator single = null;

	private MybatisPlusGenerator() {
		super();
	}

	private static MybatisPlusGenerator getSingle() {
		if(single == null) {
			single =new MybatisPlusGenerator();
		}
		return single;
	}

	public void autoGeneration() {
		 GlobalConfig config = new GlobalConfig();
	        String dbUrl = "jdbc:mysql://47.93.210.234:3306/hotel?useUnicode=true&useSSL=false&characterEncoding=utf8";
	        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//
	        dataSourceConfig.setUrl(dbUrl).setDbType(DbType.MYSQL)
	                .setUsername("root")
	                .setPassword("root")
	                .setDriverName("com.mysql.cj.jdbc.Driver");
	        StrategyConfig strategyConfig = new StrategyConfig();
	        strategyConfig
	                .setCapitalMode(true)
	                .setEntityLombokModel(false)
	                //.setDbColumnUnderline(true)
	                .setNaming(NamingStrategy.underline_to_camel);
	        config.setActiveRecord(false)
	                .setEnableCache(false)
	                .setAuthor("zzg")
	                //指定输出文件夹位置D:\ideaworkspace\hotel
	                .setOutputDir("d:\\ideaworkspace\\hotel\\src\\main\\java")
	                .setFileOverride(true)
	                .setServiceName("%sService");
	        new AutoGenerator().setGlobalConfig(config)
	                .setDataSource(dataSourceConfig)
	                .setStrategy(strategyConfig)
	                .setPackageInfo(
	                        new PackageConfig()
	                                .setParent("com.qiaoxc.hotel")
	                                .setController("controller")
	                                .setEntity("entity")
	                ).execute();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MybatisPlusGenerator generator = MybatisPlusGenerator.getSingle();
		generator.autoGeneration();
	}

}