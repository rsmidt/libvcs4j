package de.unibremen.st.libvcs4j;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a single commit.
 */
@SuppressWarnings("unused")
public interface Commit {

	/**
	 * Returns the commit id.
	 *
	 * @return
	 * 		The commit id.
	 */
	String getId();

	/**
	 * Returns the author of this commit.
	 *
	 * @return
	 * 		The author of this commit.
	 */
	String getAuthor();

	/**
	 * Returns the commit message.
	 *
	 * @return
	 * 		The commit message.
	 */
	String getMessage();

	/**
	 * Returns the datetime of this commit.
	 *
	 * @return
	 * 		The datetime of this commit.
	 */
	LocalDateTime getDateTime();

	/**
	 * Returns the ids of the parents of this commit.
	 *
	 * @return
	 *      The ids of the parents of this commit.
	 */
	List<String> getParentIds();

	/**
	 * Returns the list of file changes.
	 *
	 * @return
	 * 		The list of file changes.
	 */
	List<FileChange> getFileChanges();

	/**
	 * Returns whether this commit is a merge commit. That is, it has more than
	 * one parent.
	 *
	 * @return
	 *      {@code true} if this commit is a merge commit, {@code false}
	 *      otherwise.
	 */
	default boolean isMerge() {
		return getParentIds().size() >= 2;
	}
}
