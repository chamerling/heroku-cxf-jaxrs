# heroku-cxf-jaxrs

JAXRS sample using CXF and running on Heroku.

## Deploy

0. Create an heroku account, download heroku client for your distribution...
1. Login to Heroku : 'heroku auth:login'
2. Clone me then cd to cloned repository
3. Create the app on heroku : 'heroku create -s cedar'
4. Push the app to heroku : 'git push heroku master'
5. Open the new app : 'heroku open'

## Use

I put some sample on how to use JAXRS in different situations with different needs: Check the code for details (org.chamerling.heroku.service.rest.SampleService). The list method shows a way to return JSON array using JAXB annotated classes, there are other solutions but this one is not so bad...

URLs:

- http://yourherokuinstance/sample/ping : Returns raw pong message
- http://yourherokuinstance/sample/list : Returns a JSON array
- http://yourherokuinstance/sample/query?foo=bar : Returns the bar value in a bean
- http://yourherokuinstance/sample/path/foo : Returns the 'foo' path paremeter

