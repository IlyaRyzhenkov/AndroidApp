// Generated by Dagger (https://dagger.dev).
package com.example.domain;

import com.example.domain.operations.OperationFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DomainModule_ProvideOperationFactoryFactory implements Factory<OperationFactory> {
  private final DomainModule module;

  public DomainModule_ProvideOperationFactoryFactory(DomainModule module) {
    this.module = module;
  }

  @Override
  public OperationFactory get() {
    return provideOperationFactory(module);
  }

  public static DomainModule_ProvideOperationFactoryFactory create(DomainModule module) {
    return new DomainModule_ProvideOperationFactoryFactory(module);
  }

  public static OperationFactory provideOperationFactory(DomainModule instance) {
    return Preconditions.checkNotNull(instance.provideOperationFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
