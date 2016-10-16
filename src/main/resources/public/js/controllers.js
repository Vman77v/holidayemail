angular.module('app.controllers', []).controller('HistoryListController',
		function($scope, $state, popupService, $window, History) {
			$scope.histories = History.query(); // fetch all email histories. Issues a GET to /api/vi/histories

			$scope.deleteHistory = function(history) { // Delete a History. Issues a DELETE to /api/v1/histories/:id
				if (popupService.showPopup('Really delete this?')) {
					history.$delete(function() {
						$scope.histories = History.query();
						$state.go('histories');
					});
				}
			};
		}).controller('HistoryViewController',
		function($scope, $stateParams, History) {
			$scope.history = History.get({
				id : $stateParams.id
			}); // Get a single history.Issues a GET to /api/v1/histories/:id
		})
		
		
		.controller('HistoryCreateController',
		function($scope, $state, $stateParams, History) {
			$scope.history = new History(); // create new history instance.Properties will be set via ng-model on UI

			$scope.addHistory = function() { // create a new history. Issues a POST to /api/v1/histories
				$scope.history.$save(function() {
					$state.go('histories'); // on success go back to the list i.e. histories state.
				});
			};
		})
		
		
		.controller('HitoryEditController',
		function($scope, $state, $stateParams, History) {
			$scope.updateHistory = function() { // Update the edited history. Issues a PUT to /api/v1/histories/:id
				$scope.history.$update(function() {
					$state.go('histories'); // on success go back to the list i.e. histories state.
				});
			};

			$scope.loadHistory = function() { // Issues a GET request to api/v1/histories/:id to get a history to update
				$scope.history = History.get({
					id : $stateParams.id
				});
			};

			$scope.loadHistory(); // Load a history which can be edited on ui
		});
