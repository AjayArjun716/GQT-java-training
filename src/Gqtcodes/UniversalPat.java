package Gqtcodes;
//Alphabet--A
import java.util.Scanner;
		public class UniversalPat {
				public static void main(String[] args) {		
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter the value of n :");
					int n = sc.nextInt();
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
						System.out.println();}
//		}
		
//	}


//Alphabet--B
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if(j==0||(j==n/2 && i!=0 && i!=(n-1)||
									(i==n/2 && j<n/2)||
									(i==0 && j<n/2)||
									i==(n-1) && j<n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
		
//	}


//Alphabet--C
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if((j==0 && i!=0 && i!=(n-1))||
									(i==0 && j!=0 && j<n/2)||
									(i==(n-1) && j!=0 && j<n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}


//Alphabet--D
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if(j==0 ||(i==0 && j<n/2)||(i==n-1 && j<n/2)||
							  (j==n/2 && i!=0 && i!=n-1)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}


//Alphabet--E
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
		System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if(j==0 ||(i==0 && j<=n/2)||(i==n/2 && j<=n/2)||
							  (i==(n-1) && j<=n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}
	


//Alphabet--F
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if(j==0 ||(i==0 && j<=n/2)||(i==n/2 && j<=n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}

//Alphabet--G
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if((j==0 && i!=0 &&i!=(n-1))||
							   (i==0 && j!=0 && j<=n/2) ||
							   (i==n/2 && j>n/4 && j<n/2)||
							   (i==(n-1) && j>0 && j<=n/4)||
							   (j==(n/4) && i>n/2)||
							   (j==(n/2) && i>n/2)){
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}


//Alphabet H
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if(j==0 || (i==n/2 &&  j<=n/2) ||j==n/2){
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}


//Alphabet I
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if(i==0 || (j==n/2) ||i==(n-1)){
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}


//Alphabet J
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
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
					System.out.println();}
//	}}

//Alphabet K
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if(j==0||i+j==n/2||i-j==n/2){
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}

//Alphabet--L
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=(n-1))||(i==(n-1) && j>0)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Alphabet--M
//import java.util.Scanner;
//	public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
		    System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if(j==0 ||j==(n-1) || (i-j==0 && j<=n/2 && i<=n/2)|| (i+j==(n-1) && j>=n/2)){
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}}


//Alphabet--N
//import java.util.Scanner;
//	public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
			System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if((j==0 && i>0) 
						||(j==(n-1) && i<(n-1))
						|| (i-j==0 && i>0 && j>0 && j<(n-1) &&i<(n-1))){
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}}



//Alphabet--O
//import java.util.Scanner;
//	public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
			System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if(((j==0 && i!=0 && i!=(n-1))
						||( j==(n/2) && i!=0 && i!=(n-1) )
						|| (i==0 && j!=0 && j<n/2) 
						|| (i==(n-1) && j!=0 && j<n/2))) {
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}}
//

//Alphabet--P
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
			System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if(j==0 || (j==n/2 && i!=0 && i<n/2)|| (i==0 && j<n/2)||(i==n/2 && j<n/2)) {
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}

//Alphabet--Q
//import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if((j==0 && i!=0 && i<3*n/4)
								||( j==(n/2) && i!=0 && i<3*n/4 )
								|| (i==0 && j!=0 && j<n/2) 
								|| (i==3*n/4 && j!=0 && j<n/2)||(i-j==6 && i>3*n/4 && j!=0)) {
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}
		
		
		
		
//Alphabet--R
//import java.util.Scanner;
//				public class UniversalPat {
//					public static void main(String[] args) {		
//						Scanner sc= new Scanner(System.in);
//						System.out.println("Enter the value of n :");
//						int n = sc.nextInt();
				        System.out.println("-------------");
						for(int i =0; i<=n-1;i++) {
							for(int j=0;j<=n-1;j++) {
								if(j==0 || 
									(j==n/2 && i!=0 && i<n/2)
									|| (i==0 && j<n/2)
									||(i==n/2 && j<n/2
									||(i-j==1&& i>=n/2 && j>=n/2&&i<(n-1)))) {
								System.out.print("* ");	
							}		
							else {
								System.out.print("  ");
							}
						}
							System.out.println();}
//			}}
//				
		


//Alphabet--S
//import java.util.Scanner;
//		public class UniversalPat {
//				public static void main(String[] args) {		
//					Scanner sc= new Scanner(System.in);
//					System.out.println("Enter the value of n :");
//					int n = sc.nextInt();
					System.out.println("-------------");
					for(int i =0; i<=n-1;i++) {
						for(int j=0;j<=n-1;j++) {
							if((j==0 && i!=0 && i<n/2) 
							   ||(i==0 && j!=0 && j<n/2) 
							   ||(i==n/2 && j>0 && j<n/2)
							   ||(j==n/2 && i>n/2 && i!=(n-1))
							   ||(i==(n-1) && j>0 && j<n/2)) {
							System.out.print("* ");	
						}		
						else {
							System.out.print("  ");
						}
					}
						System.out.println();}
//		}
//		
//	}
		
		
//Alphabet--T		
//		import java.util.Scanner;
//		public class UniversalPat {
//			public static void main(String[] args) {		
//				Scanner sc= new Scanner(System.in);
//				System.out.println("Enter the value of n :");
//				int n = sc.nextInt();
				System.out.println("-------------");
				for(int i =0; i<=n-1;i++) {
					for(int j=0;j<=n-1;j++) {
						if(i==0 || (j==n/2)){
						System.out.print("* ");	
					}		
					else {
						System.out.print("  ");
					}
				}
					System.out.println();}
//	}}

//Alphabet--U		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=(n-1))
					||(j==n/2 && i!=(n-1))
					||(i==(n-1) && j!=0 && j<n/2)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Alphabet--V		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i<=n/2 &&j<=n/2 && i-j==0)
					||( i<=n/2&& j>=n/2&&i+j==(n-1))){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Alphabet--W		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==(n-1)
					|| (i+j==(n-1)&& j<=n/2)
					|| (i-j==0 && j>=n/2)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Alphabet--X		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i-j==0|| i+j==(n-1)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Alphabet--Y		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
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
			System.out.println();}
//}}

//Alphabet--Z		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==0||i==(n-1)||i+j==(n-1)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Number --0
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("Numbers :");
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 && i!=(n-1))
					||(i==(n-1) && j!=0 &&j!=(n-1))
					||(j==(n-1) && i!=(n-1) && i!=0)
					||(i==0 && j!=(n-1) && j!=0)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}


//Number --1		
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==n/4||(i==(n-1) && j<=n/2)
						||(i+j==(n/4))){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Number --2
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<=n/2)||(j==(n/2)&&i<=n/2)
					||(j<=(n/2)&&i>=n/2&&i+j==(n-1))
					|| (i==(n-1) && j<=n/2)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}
//Number --3
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j<n/2)
					||(j==(n/2) && i!=0 &&i!=n/2 && i!=(n-1))
					|| (i==n/2) && j<n/2
					|| (i==n-1 && j<n/2)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Number --4
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i<=(3*n/4)) || (i==(3*n/4) && j!=0 && j<=n/2) || (j==n/4 && i>=n/2)){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Number --5

//import java.util.Scanner;
//public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
		System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if((j==0  && i<n/2) 
					   ||(i==0 && j!=0 && j<n/2) 
					   ||(i==n/2 && j>0 && j<n/2)
					   ||(j==n/2 && i>n/2 && i!=(n-1))
					   ||(i==(n-1) && j>0 && j<n/2)) {
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}
//
//}
//Number --6

//import java.util.Scanner;
//public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
			System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if((j==0 &&i!=(n-1) && i!=0 ) 
					   ||(i==0 && j!=0 && j<n/2) 
					   ||(i==n/2 && j>0 && j<n/2)
					   ||(j==n/2 && i>n/2 && i!=(n-1))
					   ||(i==(n-1) && j>0 && j<n/2)) {
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}
//
//}

//Number --7

//import java.util.Scanner;
//public class UniversalPat {
//		public static void main(String[] args) {		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the value of n :");
//			int n = sc.nextInt();
			System.out.println("-------------");
			for(int i =0; i<=n-1;i++) {
				for(int j=0;j<=n-1;j++) {
					if((i==0&&j<=n/2)
						||(j==n/2 && i!=0 )
						||(i==n/2 && j>n/4 && j<(3*n/4))) {
					System.out.print("* ");	
				}		
				else {
					System.out.print("  ");
				}
			}
				System.out.println();}
//}
//
//}

//Number --8

//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 && i!=(n-1)&&i!=n/2)
					||(i==(n-1) && j!=0 &&j!=(n-1))
					||(j==(n-1) && i!=(n-1) && i!=0 &&i!=n/2)
					||(i==0 && j!=(n-1) && j!=0)
					||(i==n/2 && j!=0 && j!=(n-1))){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
//}}

//Number--9
//import java.util.Scanner;
//public class UniversalPat {
//	public static void main(String[] args) {		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the value of n :");
//		int n = sc.nextInt();
		System.out.println("-------------");
		for(int i =0; i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 &&i<n/2)
					||(j==(n-1) && i!=(n-1) && i!=0 &&i!=n/2)
					||(i==0 && j!=(n-1) && j!=0)
					||(i==n/2 && j!=0 && j!=(n-1))){
				System.out.print("* ");	
			}		
			else {
				System.out.print("  ");
			}
		}
			System.out.println();}
}}


