package com.obss.mentor.user.constants;

/**
 * User roles in application.
 * 
 * @author Goktug Selcuk
 *
 */
public enum UserRole {

  MENTOR_GROUP_LEADER,
  MENTOR_NORMAL,
  MENTEE,
  USER;
  
  public static boolean isUser(UserRole role) {
    return USER.equals(role);
  }

}
