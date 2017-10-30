# Spring question

When running `FailureTest`, why does Spring initialize without an error about two instances of `MessagePublisher` being available? Both `SystemOutMessagePublisher` and `MessagePublisherMock` are available.

Maybe it has something to do with how the configuration files are used?

Note that you can run both `DemoApplication` and `SuccessTest` successfully.
