package com.javasampleapproach.solr.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "customer")
public class Customer {
	@Id
	@Field
	private String id;

	@Field
	private String name;

	@Field
	private String nickname;
	
	@Field
	private Integer age;
	
	public Customer() {
	}
	
	public Customer(String id, String name, String nickname, Integer age){
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.age = age;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}
	
	public Integer getAge(){
		return this.age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Customer [id=" + this.id + ", name=" + this.name + ", age=" + this.age + "]";
	}
}
