[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4401014&assignment_repo_type=AssignmentRepo)
# Chapter-2-Lab-4

Lab Goal :   This lab was designed to teach you more about iterators.


Lab Description :   Read in a list of words and a word to remove from the list.   Remove all occurrences of the word from the list.  You must use an Iterator.



Files Needed ::
IteratorRemover.java
Main.java
.replit
run_button.sh

Use an ArrayList to store the list.
Use split( ) to split the String input into a String[] array.

String[] words = "abc cde fgh ijk".split(" ");   

ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));

You can use list.toString().replaceAll() to print out the ArrayList in one line.


Sample Data : 
a b c a b c a     a
a b c d e f g h i j x x x x     x
1 2 3 4 5 6 a b c a b c     b



Sample Output :
[b, c, b, c]


[a, b, c, d, e, f, g, h, i, j]


[1, 2, 3, 4, 5, 6, a, c, a, c]

