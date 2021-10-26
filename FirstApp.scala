import java.sql.{Connection, DriverManager};

import scala.io.StdIn.readLine;

object FirstApp {

  def main(args: Array[String]): Unit = {

    println("------------MAIN MENU-------------")
    println("Select and option from below by number:")
    println("");
    println("1. List all titles")
    println("2. Find title by: ")
    println("3. Insert movie into database")

    val option = readLine();

    //println(option)


    if (option.toInt == 1) {
     try {
        val dbUrl = "jdbc:mysql://localhost:3306/movies"
        val username = "root"
        val password = "_YpUF7@D1!"
        //get a connection(Step 1)
        val myConnection = DriverManager.getConnection(dbUrl, username, password)
        //Create a statement object(step 2)
        val myStatement = myConnection.createStatement
        //execute query (step 3)
        val myResultSet = myStatement.executeQuery("select * from movies;")
        //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
        //process result set
        while ( {
          myResultSet.next
        }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
          System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
        }
      } catch {
        case e: Exception =>
          System.out.println(e.getMessage)
      }
    }

    if (option.toInt == 2) {
      println("Find title by: ")
      println("1. title")
      println("2. year")
      println("3. director")
      println("4. gross_box_office")
      println("5. country")

      val option2 = readLine()

      if(option2.toInt == 1) {

        println("Enter title")

        val title = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeQuery("select * from movies where title = '" + title + "';")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          while ( {
            myResultSet.next
          }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
            System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
          }
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }

      if(option2.toInt == 2) {

        println("Enter year")

        val year = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeQuery("select * from movies where year = '" + year + "';")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          while ( {
            myResultSet.next
          }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
            System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
          }
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }

      if(option2.toInt == 3) {

        println("Enter director")

        val director = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeQuery("select * from movies where director = '" + director + "';")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          while ( {
            myResultSet.next
          }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
            System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
          }
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }

      if(option2.toInt == 4) {

        println("Enter gross_box_office")

        val gross_box_office = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeQuery("select * from movies where gross_box_office = '" + gross_box_office + "';")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          while ( {
            myResultSet.next
          }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
            System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
          }
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }

      if(option2.toInt == 5) {

        println("Enter country")

        val country = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeQuery("select * from movies where country = '" + country + "';")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          while ( {
            myResultSet.next
          }) { //System.out.println("Student full name : " + myResultSet.getString("firstname") + " " + myResultSet.getString("lastname"));
            System.out.println("Movie Record : " + myResultSet.getString("title") + " " + myResultSet.getString("year") + " " + myResultSet.getString("director") + " " + myResultSet.getString("gross_box_office") + " " + myResultSet.getString("country"))
          }
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }

    }

    /*
    INSERT FUNCTIONALITY START
     */

    if (option.toInt == 3) {
      println("Insert movie record into database? [Y/N]");

      val option3 = readLine()

      if(option3 == "y") {

        println("Enter movie title: ")

        val title = readLine()

        println("Enter movie year: ")

        val year = readLine()

        println("Enter movie director: ")

        val director = readLine()

        println("Enter movie box office gross: ")

        val gross_box_office = readLine()

        println("Enter country: ")

        val country = readLine()

        try {
          val dbUrl = "jdbc:mysql://localhost:3306/movies"
          val username = "root"
          val password = "_YpUF7@D1!"
          //get a connection(Step 1)
          val myConnection = DriverManager.getConnection(dbUrl, username, password)
          //Create a statement object(step 2)
          val myStatement = myConnection.createStatement
          //execute query (step 3)
          val myResultSet = myStatement.executeUpdate("insert into movies(title, year, director, gross_box_office, country) values('" + title + "', " + year + ",'" + director + "', " + gross_box_office + ",'" + country + "');")
          //ResultSet myResultSet = myStatement.executeQuery(str1 + str2 + end);
          //process result set
          println("INSERTION SUCCESS!")
        } catch {
          case e: Exception =>
            System.out.println(e.getMessage)
        }
      }


    }


    /*
    INSERT FUNCTIONALITY END
     */



  }
}
