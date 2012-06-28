# heroku-cxf-jaxrs

A JAXRS sample using Apache CXF 2.5.0 and running on Heroku platform.

## Deploy

0. Create an [heroku.com](http://heroku.com) account, download heroku client for your distribution, RTFM...
1. From the shell, login to Heroku : 'heroku auth:login'
2. Clone me then cd to cloned repository
3. Create the app on heroku : 'heroku create -s cedar'
4. Push the app to heroku : 'git push heroku master'
5. Open the new app : 'heroku open'

## Use

I put some sample on how to use JAXRS in different situations with different needs: Check the code for details ([org.chamerling.heroku.service.rest.SampleService](https://github.com/chamerling/heroku-cxf-jaxrs/blob/master/src/main/java/org/chamerling/heroku/service/rest/SampleService.java)). The list method shows a way to return JSON array using JAXB annotated classes, there are other solutions but this one is not so bad...

### Useful URLs:

- http://yourapp.herokuapp.com/rest/?_wadl&_type=xml : WADL description of the service
- http://yourapp.herokuapp.com/rest/sample/ping : Returns raw pong message
- http://yourapp.herokuapp.com/rest/sample/list : Returns a JSON array
- http://yourapp.herokuapp.com/rest/sample/query?foo=bar : Returns the bar value in a bean
- http://yourapp.herokuapp.com/rest/sample/path/foo : Returns the 'foo' path paremeter

You get check the running instance at
[http://severe-spring-2425.herokuapp.com/](http://severe-spring-2425.herokuapp.com/)
