package com.lab;



public class RootNode <T extends IContent> extends SomeNode<T> implements INodeObserver<T> {
	
	
	
	
	
	

	public RootNode(T c){
		super(c);
		
	}
	
	public void  TraverseFirstLevel(SomeNode<T> sn, INodeObserver<T> o){
		for (int i=0; i<childNodes.size(); i++){
			SomeNode<T> someNode = (SomeNode<T>) childNodes.get(i);
			SomeNode <T>n= someNode;
			
			System.out.println(n.getContent());
			System.out.println(n.getContent().getClass().getName());
			o.Observe(n);
			
		}
		
	}
	
	
	
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RootNode<Empl> rn =new RootNode<Empl>(new Empl("Root",0));
		System.out.println(rn.getChildrenCount());
		rn.addNode(new SomeNode<Empl>(new Empl("Child-1",1)));
		rn.addNode(new SomeNode<Empl>(new Empl("Child-2",1)));
		SomeNode <Empl>fln = new SomeNode<Empl>(new Empl("Child3",1));
		fln.addNode(new SomeNode<Empl>(new Empl("Child1",2)));
		rn.addNode(fln);
		rn.TraverseFirstLevel(rn, new INodeObserver<Empl>() {
			
			@Override
			public void Observe(SomeNode<Empl> rn) {
				
				System.out.println(rn.getContent().getName());
				System.out.println(rn.getContent().getLevel());
			
				
				
			}
		});
	
		
		System.out.println("Done");
		System.out.println(rn);
		System.out.println(rn.getChildrenCount());
		
		
		
			
			
	}

	
	

	@Override
	public void Observe(SomeNode<T> n) {
		// TODO Auto-generated method stub
		
	}
}


	

