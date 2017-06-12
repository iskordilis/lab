package com.lab;

public interface INodeObserver <T extends IContent>{
	void Observe(SomeNode<T> n);
	
	

}
