package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int size) {
		this.buffer = new String[size];
		top = 0;
	}

	public void push(String string) {
		if(top <= buffer.length - 1) {
			buffer[top] = string;
			top++;
		}
		else {			
			String[] buffer2 = new String[buffer.length * 2];
			for(int i = 0; i < buffer.length; i++) {
				buffer2[i] = buffer[i];
			}
			this.buffer = buffer2;
			buffer[top] = string;
			top++;
		}

	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException();
		}
		else {
			String result = buffer[top - 1];
			top--;
			return result;
		}
	}

	public boolean isEmpty() {
		if(top == 0)
			return true;
		else
			return false;
	}

}