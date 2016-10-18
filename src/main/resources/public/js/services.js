angular.module('app.services', []).factory('History', function($resource) {
  return $resource('/api/v1/histories/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});