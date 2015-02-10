import java.io.Console;

public class Calendar{
	public static void main(String[] args){
		Console c = System.console();
		String year = c.readLine("Please enter the year!");
		int y = Integer.parseInt(year);
		System.out.println();
		System.out.println("Which day did the first of January fall on?");
		System.out.println();
		String day = c.readLine("Enter a number between 1-7(The 1 represents a sunday.)");
		int d = Integer.parseInt(day);
		System.out.println();
		boolean leapyear;
		if(y%4==0){
			leapyear = true;
		}
		else{
			leapyear = false;
		}
		String days = " Su Mo Tu We Th Fr Sa";
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		//Sunday
		if(d==1){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j%7==0){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("         ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Monday
		if(d==2){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("   ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==6 || j ==13 || j==20 || j==27){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("            ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Tuesday
		if(d==3){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("      ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==5 || j ==12 || j==19 || j==26){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("               ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Wednesday
		if(d==4){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("         ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==4 || j ==11 || j==18 || j==25){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("                  ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Thursday
		if(d==5){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("            ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==3 || j ==10 || j==17 || j==24 || j==31){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Friday
		if(d==6){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("               ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==2 || j ==9 || j==16 || j==23 || j==30){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("   ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
		//Saturday
		if(d==7){
			//January
			System.out.println();
			System.out.println("    " + months[0] + " " + year);
			System.out.println(days);
			System.out.print("                  ");
			for(int j=1;j<32;j++){
				if(j<10){
					System.out.print("  " + j);
				}
				if(j>=10){
					System.out.print(" " + j);
				}
				if(j==1 || j ==8 || j==15 || j==22 || j==29){
					System.out.println();
				}
			}
			//February
			System.out.println();
			System.out.println("    " + months[1] + " " + year);
			System.out.println(days);
			System.out.print("      ");
			if(leapyear == true){
				for(int j=1;j<30;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<29;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//March
			System.out.println();
			System.out.println("    " + months[2] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//April
			System.out.println();
			System.out.println("    " + months[3] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23){
						System.out.println();
					}
				}
			}
			//May
			System.out.println();
			System.out.println("    " + months[4] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			//June
			System.out.println();
			System.out.println("    " + months[5] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			//July
			System.out.println();
			System.out.println("    " + months[6] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			//August
			System.out.println();
			System.out.println("    " + months[7] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("      ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("   ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==6 || j==13 || j==20 || j==27){
						System.out.println();
					}
				}
			}
			//September
			System.out.println();
			System.out.println("    " + months[8] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24){
						System.out.println();
					}
				}
			}
			//october
			System.out.println();
			System.out.println("    " + months[9] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==7 || j==14 || j==21 || j==28){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("                  ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==1 || j==8 || j==15 || j==22 || j==29){
						System.out.println();
					}
				}
			}
			//November
			System.out.println();
			System.out.println("    " + months[10] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("         ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==4 || j==11 || j==18 || j==25){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("      ");
				for(int j=1;j<31;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==5 || j==12 || j==19 || j==26){
						System.out.println();
					}
				}
			}
			//December
			System.out.println();
			System.out.println("    " + months[11] + " " + year);
			System.out.println(days);
			if(leapyear == true){
				System.out.print("               ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==2 || j==9 || j==16 || j==23 || j==30){
						System.out.println();
					}
				}
			}
			if(leapyear == false){
				System.out.print("            ");
				for(int j=1;j<32;j++){
					if(j<10){
						System.out.print("  " + j);
					}
					if(j>=10){
						System.out.print(" " + j);
					}
					if(j==3 || j==10 || j==17 || j==24 || j==31){
						System.out.println();
					}
				}
			}
			System.exit(0);
		}
	}
}