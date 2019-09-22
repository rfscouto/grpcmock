package org.grpcmock.definitions.stub.steps;

import javax.annotation.Nonnull;
import org.grpcmock.definitions.response.Response;

public interface SingleResponseBuilderStep<ReqT, RespT> extends
    BuilderStep,
    MappingStubBuilder,
    HeadersMatcherBuilderStep<SingleResponseBuilderStep<ReqT, RespT>>,
    RequestMatcherBuilderStep<SingleResponseBuilderStep<ReqT, RespT>, ReqT> {

  /**
   * Defines the single {@link Response} that will be returned for the request and complete it.
   */
  NextSingleResponseBuilderStep<ReqT, RespT> willReturn(@Nonnull Response<ReqT, RespT> response);
}
