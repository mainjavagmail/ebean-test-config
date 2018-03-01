package io.ebean.test.config.who;

import io.ebean.config.EncryptKey;

class FixedEncryptKey implements EncryptKey {

  private final String key;

  FixedEncryptKey(String key) {
    this.key = key;
  }

  @Override
  public String getStringValue() {
    return key;
  }


}