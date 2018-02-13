package com.psl.question4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoviesExceptions {

	public static void main(String[] args) {

		File f = new File("Movies.txt");
		int i;
		String str1;
		String s[] = new String[20];
		try {
			Language l[] = Language.values();

			FileInputStream fis = null;
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			while ((str1 = br.readLine()) != null) {

				s = str1.split(",");

				int p = Integer.parseInt(s[0]) % 2;
				if ((p == 0 || p == 1))
					throw new ImproperId("The movie ID is not proper");
				for (i = 0; i < l.length; i++) {
					if (s[2] == l[i].toString())
						continue;
					else
						throw new ImproperLanguage(
								"The Movie language is not proper");
				}
				if (s.length != 4) {

					throw new ImproperArgs("No. of arguments are not proper");
				}
			}
		} catch (ImproperId e) {
			e.printStackTrace();

		} catch (ImproperLanguage e) {
			e.printStackTrace();
		} catch (ImproperArgs e) {

			e.printStackTrace();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
