/**********************************************************************
Copyright (c) 2012 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.metadata;

/**
 * Exception thrown when meta-data specific to a class is invalid.
 */
public class InvalidClassMetaDataException extends InvalidMetaDataException
{
    private static final long serialVersionUID = 6498740110129166983L;
    String className;

    public InvalidClassMetaDataException(String key, String className, Object... params)
    {
        super(key, className, params);
        this.className = className;
    }

    public String getClassName()
    {
        return className;
    }
}
