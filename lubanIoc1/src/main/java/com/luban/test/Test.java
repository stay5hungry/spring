package com.luban.test;

import com.luban.appconfig.AppConfig;
import com.luban.dao.LubanDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @author: qiuz
 * @date: 2019/5/13 16:24
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);
		LubanDao dao = acc.getBean(LubanDao.class);
		dao.query();
	}
}
