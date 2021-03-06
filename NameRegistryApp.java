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

// application class
public class NameRegistryApp
{
  public static void main (String[] args)
  {
    try (UserInterface ui = new UserInterface ())
    {
      NameRegister nameRegister = new NameRegister ();
      run (nameRegister, ui);
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }

  // application logic
  private static void run (NameRegister nameRegister, UserInterface ui)
  {
    String[] names = ui.readNames (); // read names from user
    nameRegister.setNames (names); // store names into register
    ui.showNames (nameRegister.getNames ()); // show names in register to user
  }
}
