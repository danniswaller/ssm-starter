package com.github.danniswaller.ssmstarter.entity;

import java.util.Objects;

/**
 * Created by danniswalle on 2018/8/20.
 */

/**
 * TODO: DOCUMENT ME!
 *
 * @author   $author$
 * @version  08/20/2018 13:27
 */
public class Role {
    //~ Instance fields --------------------------------------------------------------------------------------------------

    private String id;
    private String name;

    //~ Methods ----------------------------------------------------------------------------------------------------------

    /**
     * @see  java.lang.Object#equals(java.lang.Object)
     */
    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        Role role = (Role) o;

        return Objects.equals(id, role.id)
                && Objects.equals(name, role.name);
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for id.
     *
     * @return  String
     */
    public String getId() {
        return id;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for name.
     *
     * @return  String
     */
    public String getName() {
        return name;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * @see  java.lang.Object#hashCode()
     */
    @Override public int hashCode() {
        return Objects.hash(id, name);
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for id.
     *
     * @param   id  String
     *
     * @return  Role
     */
    public Role setId(String id) {
        this.id = id;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for name.
     *
     * @param   name  String
     *
     * @return  Role
     */
    public Role setName(String name) {
        this.name = name;

        return this;
    }
} // end class Role
