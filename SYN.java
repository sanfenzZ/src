package src;

	class Resource{
		private String name;
		private String sex;
		private boolean bool = false;
		
		public synchronized void set(String n,String s){
			if(bool)
				try{this.wait();}catch(InterruptedException w){}
			name = n;
			sex = s;
			bool = true;
			this.notify();
		}
	
		public synchronized void out(){
			if(!bool)
				try{this.wait();}catch(InterruptedException w){}
			System.out.println(name+"...."+sex);
			bool = false;
			this.notify();
		}
	
	}
	class Input implements Runnable{
		Resource r;
		Input(Resource r){
			this.r = r;
		}
		public void run(){
			int x = 0;
			for(int i=0;i<5;i++){
			
			if(x%2 == 0){
				r.set("ÀÏÈË", "ÄÐ");
			}else{
				r.set("fjls", "sl");
			}
			x++;
		}}
	}
	class Output implements Runnable{
		Resource r;
		Output(Resource r){
			this.r = r;
		}
		public void run(){
			for(int i=0;i<7;i++)
				r.out();
		}
	}
	class SYN{
		public static void main(String[] args){
			Resource r = new Resource();

			Input in = new Input(r);
			Output out = new Output(r);
			
			Thread t1 = new Thread(in);
			Thread t2 = new Thread(out);
			t1.start();
			t2.start();
		}
	}

