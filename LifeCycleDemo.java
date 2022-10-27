package com.lif;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LifeCycleDemo {
	@Before
	public void beforeAll(){
		System.out.println("connect to the database");
		
	}
	@Before
	public void before1() {
		System.out.println("load the schema");
		
	}
	@After
	public void after() {
		System.out.println("drop the scema");
	}
	@After
	public void after1() {
		System.out.println("disconnect from the database");
	}	
		
	

	@Test
	public void test() {
		System.out.println("test one");
	}
	@Test
	public void test1() {
		System.out.println("test two");
	
	}
}
