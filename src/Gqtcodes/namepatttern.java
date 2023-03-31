package Gqtcodes;
import java.util.Scanner;

public class namepatttern {
				public static void main(String[] args) {		
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter the value of n :");
					int n = sc.nextInt();
					//logic for A
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if(j==0||j==n/2||
									(i==n/2 && j<=n/2)||
									(i==0 && j<=n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						//Logic for J
							for(int j=0;j<=n-1;j++) {
								if(i==0 || 
									(j==n/2 && i<(n-1)) 
									|| (i==(n-1)&&j>n/4&&j<n/2)
									||( j==n/4)&& i>3*(n/4) && i<(n-1)){
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
							System.out.print("   ");
							//logic for A
							for(int j=0;j<=n-1;j++) {
								if(j==0||j==n/2||
										(i==n/2 && j<=n/2)||
										(i==0 && j<=n/2)) {
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
							
						//logic for Y
							for(int j=0;j<=n-1;j++) {
								if((i<=n/2 &&j<=n/2 && i-j==0) 
									||( i<=n/2&& j>=n/2&&i+j==(n-1))
									|| (j==n/2 && i>=n/2)){
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
							//logic for .
							for(int j=0;j<=n-1;j++) {
								if(i==n/2 && j==n/2){
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
							
						//logic for R
							for(int j=0;j<=n-1;j++) {
								if(j==0 || 
									(j==n/2 && i!=0 && i<n/2)
									|| (i==0 && j<n/2)
									||(i==n/2 && j<n/2
									||(i-j==n/2&& i>=n/2 && j>=0&&i<=(n-1)))) {
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
					System.out.println();}
				}}
					
					
					
					
		
	

