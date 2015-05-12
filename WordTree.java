import java.util.*;
import java.io.*;

public class WordTree<Character> {
	public WordTreeNode<Character> root;
	
	public WordTree ( char data ) {
		root = new WordTreeNode ( data );
		for (int i = 0; i < 26; i ++) {
			int letter = (int)'a' + i;
			WordTreeNode child = new WordTreeNode((char)letter);
			root.setChild(i, child);
		}
	}
	
	public void populate ( List<String> l ) {
		while (l.size() > 0) {
			String s = l.remove(0);
			int i = 0;
			while (s.charAt(0) != root.getChild(i).getData())
				i ++;
			
	}	
}
