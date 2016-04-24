package com.fruit.base.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.fruit.base.dao.MongoDao;

@Component
public class MongoDaoImpl<T> implements MongoDao<T> {

	@Autowired
    protected MongoTemplate mongoTemplate;
	/**
	 * insert:对象中如有id字段，将作为字段'_id'的值,如没有id,将生成一个'_id',保存时如已有相同id,将报错
	 * save:如已有相同id,将update
	 */
	@Override
	public void save(T t) {
		this.mongoTemplate.insert(t);
	}

}
