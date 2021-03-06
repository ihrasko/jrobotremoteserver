package org.robotframework.remoteserver.keywords;

import org.robotframework.javalib.keyword.DocumentedKeyword;

/**
 * Represent extension of {@link DocumentedKeyword} and {@link TaggedKeyword}
 * capable of verifying if Keyword can be executed with provided arguments
 */
public interface CheckedKeyword extends DocumentedKeyword, TaggedKeyword {

    /**
     * Checks if {@link org.robotframework.javalib.keyword.Keyword} is capable of execution with provided arguments
     *
     * @param args Arguments that will be used in {@link org.robotframework.javalib.keyword.Keyword} execution
     * @return If {@link org.robotframework.javalib.keyword.Keyword} compatible with arguments
     */
    boolean canExecute(Object[] args);

    /**
     * Returns argument types used in current {@link org.robotframework.javalib.keyword.Keyword}
     *
     * @return Arrays containing ordered {@link Class} of each argument
     */
    Class<?>[] getArguments();

}
