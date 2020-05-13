resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/ownSmai2yOa5arjIYU2XzXkcZNwBxaRWfhF6ChOaoZgugyHw/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/ownSmai2yOa5arjIYU2XzXkcZNwBxaRWfhF6ChOaoZgugyHw/commercial-releases"))(Resolver.ivyStylePatterns)