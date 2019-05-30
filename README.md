# Java Developer application for Synconext
## Web application to list service providers

This web application was created using HTML/CSS and BootStrap 4 for the front-end with Font Awesome for icons. The back-end was coded using JSP, and Apache Derby was used for the database.
NetBeans IDE was used to develop the web application.

**To execute the web application:**

1. Create a new database in Netbeans with Apache Derby called **synconext_db**. Set the username as **root** and the password as **highgarden**.
2. Create a new table **providers** with the following query (as explained in the assignment):

CREATE TABLE PROVIDERS ("NAME" VARCHAR(50), LOWEST_PRICE DOUBLE, RATING INTEGER, MAX_SPEED VARCHAR(20), DESCRIPTION VARCHAR(500), CONTACT_NO VARCHAR(20), EMAIL VARCHAR(100), IMAGE VARCHAR(200), URL VARCHAR(200));

3. Populate the **providers** table with the following data:

![Data to be entered into table- 1](https://i38.photobucket.com/albums/e137/haraeshj/as2_zpsmtp6tkud.png)

![Data to be entered into table- 2](https://i38.photobucket.com/albums/e137/haraeshj/as2_zpsmtp6tkud.png)

4. Create a new JSP page under your project and copy the code contained within **main.jsp** into it.

5. Run **main.jsp**. You should receive the following screen:

![Output](https://i38.photobucket.com/albums/e137/haraeshj/as3_zps9qnhykuy.png)
