<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%><!DOCTYPE html>
<html dir="ltr" lang="en-US">
   <head>
      <meta charset="UTF-8" />
      <title></title>
      <link href="bootstrap.min.css" rel="stylesheet">
      <link href="font-awesome.min.css" rel="stylesheet">
      <link rel="stylesheet" type="text/css" media="all" href="daterangepicker-bs3.css" />
      <script type="text/javascript" src="jquery-1.8.3.min.js"></script>
      <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
      <script type="text/javascript" src="moment.js"></script>
      <script type="text/javascript" src="daterangepicker.js"></script>
   </head>
   <body>

      <div class="container">
         <div class="span12">
            <div class="well">

               <form class="form-horizontal">
                 <fieldset>
                  <div class="control-group">
                    <div class="controls">
                     <div class="input-prepend input-group">
                       <span class="add-on input-group-addon"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></span><input type="text" readonly style="width: 200px" name="reservation" id="reservation" class="form-control" value="2014-5-21 - 2014-6-21" /> 
                     </div>
                    </div>
                  </div>
                 </fieldset>
               </form>

               <script type="text/javascript">
               $(document).ready(function() {
                  $('#reservation').daterangepicker(null, function(start, end, label) {
                    console.log(start.toISOString(), end.toISOString(), label);
                  });
               });
               </script>

            </div>


         </div>
      </div>

   </body>
</html>
