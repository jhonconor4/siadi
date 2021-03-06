(function (angular, $) {
    angular.module('ngValidate', [])
            .directive('ngValidate', function () {
                return {require: 'form', restrict: 'A', scope: {ngValidate: '='}, link: function (scope, element, attrs, form) {
                        var validator = element.validate(scope.ngValidate);
                        form.validate = function (options) {
                            var oldSettings = validator.settings;
                            validator.settings = $.extend(true, {}, validator.settings, options);
                            var valid = validator.form();
                            validator.settings = oldSettings;
                            return valid;
                        };
                        form.numberOfInvalids = function () {
                            return validator.numberOfInvalids();
                        };
                    }
                };
            })
            .provider('$validator', function () {
                $.validator.setDefaults({onsubmit: false});
                return {setDefaults: function (options) {
                        $.validator.setDefaults(options);
                    }, addMethod: function (name, method, message) {
                        $.validator.addMethod(name, method, message);
                    }, setDefaultMessages: function (messages) {
                        angular.extend($.validator.messages, messages);
                    }, format: function (source, params) {
                        return $.validator.format(source, params);
                    }, $get: function () {
                        return {};
                    }};
            });
}(angular, jQuery));
