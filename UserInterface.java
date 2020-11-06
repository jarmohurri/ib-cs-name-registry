// Copyright (C) 2020 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

import java.util.Scanner;

public class UserInterface implements AutoCloseable
{
  public UserInterface ()
  {
    scanner = new Scanner (System.in);
  }

  // reads names from data source
  public String[] readNames ()
  {
    // code to be written here
    return new String [0];
  }

  // prints names, each name on a separate line
  public void showNames (String[] names)
  {
    // code to be written here
  }

  // returns next line (name), return value is empty string if no more
  // names are available
  private String readName ()
  {
    if (scanner.hasNextLine ())
      return scanner.nextLine ();
    else
      return "";
  }

  public void close ()
  {
    scanner.close ();
  }

  private Scanner scanner;
}
