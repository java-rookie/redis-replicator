/*
 * Copyright 2016-2018 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class IncrByTypeOffsetIncrement implements Statement {

    private static final long serialVersionUID = 1L;

    private String type;
    private String offset;
    private long increment;
    private byte[] rawType;
    private byte[] rawOffset;

    public IncrByTypeOffsetIncrement() {
    }

    public IncrByTypeOffsetIncrement(String type, String offset, long increment) {
        this(type, offset, increment, null, null);
    }

    public IncrByTypeOffsetIncrement(String type, String offset, long increment, byte[] rawType, byte[] rawOffset) {
        this.type = type;
        this.offset = offset;
        this.increment = increment;
        this.rawType = rawType;
        this.rawOffset = rawOffset;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public long getIncrement() {
        return increment;
    }

    public void setIncrement(long increment) {
        this.increment = increment;
    }

    public byte[] getRawType() {
        return rawType;
    }

    public void setRawType(byte[] rawType) {
        this.rawType = rawType;
    }

    public byte[] getRawOffset() {
        return rawOffset;
    }

    public void setRawOffset(byte[] rawOffset) {
        this.rawOffset = rawOffset;
    }

    @Override
    public String toString() {
        return "IncrByTypeOffsetIncrement{" +
                "type='" + type + '\'' +
                ", offset='" + offset + '\'' +
                ", increment=" + increment +
                '}';
    }
}