package com.klu.main;
import com.klu.Bean.StudentBean;
import com.klu.Insert.StudentInsertion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentMain
{
		public static void main(String[] args) throws SQLException ,ClassNotFoundException
		{
			Scanner sc=new Scanner(System.in);
			StudentInsertion si=new StudentInsertion();
			StudentBean sb=new StudentBean();
			sb.setRegno(101);
			sb.setName("hima");
			sb.setEmail("vhs@co.in");
			while(true) {
				System.out.println("select an CURD Operation");
				System.out.println("1.Insertion\n2.Deletion\n3.Updation\n4.Display\n5.Exit");
				int op=sc.nextInt();
				switch(op) {
					case 1: int i=si.StudentInsert(sb);
								if(i>0)
								{
									System.out.println("insertion is successfull");
								}
								else
								{
									System.out.println("fail");
								}
								break;
					case 2: int j=si.StudentDelete(sb);
								if(j>0)
								{
									System.out.println("deletion is successfull");
								}
								else
								{
									System.out.println("fail");
								}
								break;
					case 3: int k=si.StudentUpdate(sb);
								if(k>0)
								{
									System.out.println("updation is successfull");
								}
								else
								{
									System.out.println("fail");
								}
								break;
					case 4: boolean l=si.StudentDisplay(sb);
								if(l==true)
								{
									System.out.println("display is successfull");
								}
								else
								{
									System.out.println("fail");
								}
								break;
					case 5: System.exit(0);
				}
			}
		}
	}