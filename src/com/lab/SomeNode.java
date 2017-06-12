package com.lab;

import java.util.ArrayList;

public class SomeNode<T extends IContent> {
	
	T content;
	ArrayList<SomeNode<T>>childNodes =new ArrayList<SomeNode<T>>();
	public  SomeNode(T content) {
		setContent(content);
		
	}
	
	void setContent(T content){
		this.content=content;
		
	}
	
	T getContent() {
		return this.content;
	}
	void addNode(SomeNode<T> n){
		childNodes.add(n);
	}
	
		public ArrayList<SomeNode<T>> getChildren(){
			return childNodes;
			
		}
		
		public int getChildrenCount(){
			return childNodes.size();
		}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
