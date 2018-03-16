/*----------------------------------------------------------------------------*/
/* Source File:   OWNERENTITY.CS                                              */
/* Description:   Defines a mapping to a relationAL table (OWNER)             */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2018                                                 */
/* Last Modified: Mar.16/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ.                                                */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2018 COQ  File created.
 -----------------------------------------------------------------------------*/

using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Account.Owner.Entity
{
    /// <summary>
    /// Defines a mapping to a relational table (OWNER).
    /// </summary>
    [Table("owner")]
    public class OwnerEntity
    {
        [Key]
        public Guid OwnerId { get; set; }

        [Required(ErrorMessage = "Name is required")]
        [StringLength(60, ErrorMessage = "Name can't be longer than 60 characters")]
        public string Name { get; set; }

        [Required(ErrorMessage = "Date of birth is required")]
        public DateTime DateOfBirth { get; set; }

        [Required(ErrorMessage = "Address is required")]
        [StringLength(100, ErrorMessage = "Address cannot be loner then 100 characters")]
        public string Address { get; set; }
    }
}
