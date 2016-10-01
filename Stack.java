
public class Stack {
	int[] myStack;
	int size;
	
	public Stack(){
		this.myStack = new int[10];
	}
	public void push(int num){
		if(size>= myStack.length){
			int[] newElements = new int [myStack.length *2];
			System.arraycopy(myStack, 0, newElements, 0, myStack.length);
			myStack = newElements;
		}
		myStack[size] = num;
		size++;
	}
	public int pop(){
		size--;
		return myStack[size];
	}
	
	public int peek(){
		return myStack[size-1];
	}

	
	public String toString(){
		String theString ="";
		for(int i=0; i<size; i++){
			theString+= myStack[i]+" ";
		}
		return theString;
	}

}
