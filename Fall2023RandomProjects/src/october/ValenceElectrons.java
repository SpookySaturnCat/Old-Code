package october;

import java.util.Scanner;

public class ValenceElectrons {
	
	static String fullElectronConfiguration = "1S2 2S2 2P6 3S2 3P6 4S2 3D10 4P6 5S2 4D10 5P6 6S2 4F14 5D10 6P6 7S2 5F14 6D10 7P6";

	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Create and initilize variables
		int place;
		int atomicNumber = 50;
		String symbol = "";
		do {                                              

			// Prompt user and store value
			System.out.print(
					"Enter 999 to exit\nPlease enter the atomic number of the element you want the full electron configuration of: ");
			atomicNumber = input.nextInt();

			// Switch statement to modify electron configuration value
			switch (atomicNumber) {
			case 1:
				// 1s1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 2) + place;
				symbol = "H";
				break;
			case 2:
				// 1s2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 3);
				symbol = "He";
				break;
			case 3:
				// 2s1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 6) + place;
				symbol = "Li";
				break;
			case 4:
				// 2s2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 7);
				symbol = "Be";
				break;
			case 5:
				// 2p1
				place = 1;
				symbol = "B";
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 10) + place;
				break;
			case 6:
				// 2p2
				symbol = "C";
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 10) + place;
				break;
			case 7:
				// 2p3
				symbol = "N";
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 10) + place;
				break;
			case 8:
				// 2p4
				symbol = "O";
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 10) + place;
				break;
			case 9:
				// 2p5
				symbol = "F";
				place = 5; 
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 10) + place;
				break;
			case 10:
				// 2p6
				symbol = "Ne";
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 11);
				break;
			case 11:
				// 3s1
				symbol = "Na";
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 14) + place;
				break;
			case 12:
				// 3s2
				symbol = "Mg";
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 15);
				break;
			case 13:
				// 3p1
				symbol = "Al";
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 18) + place;
				break;
			case 14:
				// 3p2
				symbol = "Si";
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 18) + place;
				break;
			case 15:
				// 3p3
				symbol = "P";
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 18) + place;
				break;
			case 16:
				// 3p4
				symbol = "S";
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 18) + place;
				break;
			case 17:
				// 3p5
				symbol = "Cl";
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 18) + place;
				break;
			case 18:
				symbol = "Ar";
				// 3p6
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 19);
				break;
			case 19:
				// 4s1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 22) + place;
				break;
			case 20:
				// 4s2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 23);
				break;
			case 21:
				// 3d1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 22:
				// 3d2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 23:
				// 3d3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 24:
				// 3d4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 25:
				// 3d5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
				// 3d6
			case 26:
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 27:
				// 3d7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 28:
				// 3d8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26);
				break;
			case 29:
				// 3d9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 26) + place;
				break;
			case 30:
				// 3d10
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 28);
				break;
			case 31:
				// 4p1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 31) + place;
				break;
			case 32:
				// 4p2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 31) + place;
				break;
			case 33:
				// 4p3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 31) + place;
				break;
			case 34:
				// 4p4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 31) + place;
				break;
			case 35:
				// 4p5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 31) + place;
				break;
			case 36:
				// 4P6
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 32);
				break;
			case 37:
				// 5s1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 35) + place;
				break;
			case 38:
				// 5s2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 36);
				break;
			case 39:
				// 4d1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 40:
				// 4d2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 41:
				// 4d3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 42:
				// 4d4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 43:
				// 4d5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 44:
				// 4d6
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 45:
				// 4d7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 46:
				// 4d8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 47:
				// 4d9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 39) + place;
				break;
			case 48:
				// 4d10
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 41);
				break;
			case 49:
				// 5P1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 44) + place;
				break;
			case 50:
				// 5P2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 44) + place;
				break;
			case 51:
				// 5P3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 44) + place;
				break;
			case 52:
				// 5P4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 44) + place;
				break;
			case 53:
				// 5P5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 44) + place;
				break;
			case 54:
				// 5P6
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 45);
				break;
			case 55:
				// 6S1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 48) + place;
				break;
			case 56:
				// 6S2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 49);
				break;
			case 57:
				// 4F1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 58:
				// 4F2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 59:
				// 4F3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 60:
				// 4F4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 61:
				// 4F5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 62:
				// 4F6
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 63:
				// 4F7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 64:
				// 4F8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 65:
				// 4F9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 66:
				// 4F10
				place = 10;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 67:
				// 4F11
				place = 11;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 68:
				// 4F12
				place = 12;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 69:
				// 4F13
				place = 13;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 52) + place;
				break;
			case 70:
				// 4F14
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 54);
				break;
			case 71:
				// 5D1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 72:
				// 5D2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 73:
				// 5D3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 74:
				// 5D4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 75:
				// 5D5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 76:
				// 5D6
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 77:
				// 5D7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 78:
				// 5D8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 79:
				// 5D9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 57) + place;
				break;
			case 80:
				// 5D10
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 59);
				break;
			case 81:
				// 6P1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 62) + place;
				break;
			case 82:
				// 6P2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 62) + place;
				break;
			case 83:
				// 6P3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 62) + place;
				break;
			case 84:
				// 6P4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 62) + place;
				break;
			case 85:
				// 6P5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 62) + place;
				break;
			case 86:
				// 6P6
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 64);
				break;
			case 87:
				// 7S1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 66) + place;
				break;
			case 88:
				// 7S2
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 67);
				break;
			case 89:
				// 5F1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 90:
				// 5F2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 91:
				// 5F3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 92:
				// 5F4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 93:
				// 5F5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 94:
				// 5F6
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 95:
				// 5F7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 96:
				// 5F8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 97:
				// 5F9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 98:
				// 5F10
				place = 10;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 99:
				// 5F11
				place = 11;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 100:
				// 5F12
				place = 12;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 101:
				// 5F13
				place = 13;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 102:
				// 5F14
				place = 14;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 70) + place;
				break;
			case 103:
				// 6D1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 104:
				// 6D2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 105:
				// 6D3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 106:
				// 6D4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 107:
				// 6D5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 108:
				// 6D6
				place = 6;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 109:
				// 6D7
				place = 7;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 110:
				// 6D8
				place = 8;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 111:
				// 6D9
				place = 9;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 112:
				// 6D10
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 77);
				break;
			case 113:
				// 7P1
				place = 1;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 80) + place;
				break;
			case 114:
				// 7P2
				place = 2;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 115:
				// 7P3
				place = 3;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 116:
				// 7P4
				place = 4;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 117:
				// 7P5
				place = 5;
				fullElectronConfiguration = fullElectronConfiguration.substring(0, 75) + place;
				break;
			case 118:
				// 7P6
				break;
			default:
				System.out.println("You entered an invalid atomic number. Try again.");

			}
			System.out.println(fullElectronConfiguration + "\n");
		} while (atomicNumber != 999);
	}
}
