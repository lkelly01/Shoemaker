import java.util.Scanner;

import java.util.Arrays;

import java.util.Comparator;


public class Shoemaker {

public static void main(String args[]) throws Throwable {

Scanner sc = new Scanner(System.in);

//taking the input N from User

int N = sc.nextInt();

int[][] arr = new int[N][2];

Job [] priority = new Job[N];

Job j;

//this loop will read input from user and store value in job class object

for (int i = 0; i < N; i++) {

j=new Job();

arr[i][0] = sc.nextInt();

arr[i][1] = sc.nextInt();

j.job=i+1;

j.priority=(double)arr[i][1] / arr[i][0]; //calculating the priority

priority[i]=j;

}

//sorting the using Priority comprator class

Arrays.sort(priority,new Priority());

//printing the result

for(Job jb:priority){

System.out.print(jb.job+" ");

}

System.out.println("");

}

}

class Job {

int job;

double priority;

}

class Priority implements Comparator<Job> {

@Override

public int compare(Job j1, Job j2) {

double p1 = j1.priority;

double p2 = j2.priority;

if (j1.priority == j2.priority) {

return 0;

} else if (j1.priority < j2.priority) {

return 1;

} else {

return -1;

}

}

}