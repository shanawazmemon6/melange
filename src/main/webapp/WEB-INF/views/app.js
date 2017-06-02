var app=angular.module('myApp',['ui.router']);

app.config(function($stateProvider, $urlRouterProvider,$qProvider,$locationProvider) {
	   $urlRouterProvider.otherwise('/')
	   $locationProvider.hashPrefix('');

 $qProvider.errorOnUnhandledRejections(false)
	 $stateProvider
	
	.state('home',{
              url: '/',
		templateUrl:'html/main.html'
			
	})
	.state('admin',{

		url:'/admin',
		templateUrl:'admin_html/admin_panel.html'
		
	})
	
	.state('admin.welcome_admin',{

		url:'/welcome_admin',
		
		  		templateUrl:'admin_html/welcome_admin.html'
		     
		
	})
	
	 
	
})


