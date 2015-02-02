'use strict';

// Declare app level module which depends on views, and components
var labApp = angular.module('labApp', [
  'ngRoute',
  'studentAppMainControllers'
])
labApp.config(['$routeProvider',
  function($routeProvider) {
  $routeProvider.
      when('/lab03-list',{
        templateUrl: 'template/lab3-queryStudent.html',
        controller: 'getStudentFromUrlController'
      }).
      when('/lab03-query',{
        templateUrl: 'template/lab3-queryStudent.html',
        controller: 'getStudentFromGPAController'
      }).
       otherwise({redirectTo: '/lab01'});
}]);
