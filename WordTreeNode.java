import java.util.*;
import java.io.*;

public class WordTreeNode<Character> {
	
	private char data;
	private WordTreeNode<Character> root;
	private List<WordTreeNode<Character>> children;
	
	public WordTreeNode ( char d ) {
		data = d;
		children = new LinkedList<WordTreeNode<Character>>();
	}
	
	public String toString () {
		return "" + data;
	}
	
	public void setData ( char c ) {
		data = c;
	}
	
	public char getdata () {
		return data;
	}
	
	public void setChild ( int i, WordTreeNode<Character> c ) {
		children.set( i, c );
	}
	
	public WordTreeNode<Character> getChild ( int i ) {
		return children.get( i );
	}
}
