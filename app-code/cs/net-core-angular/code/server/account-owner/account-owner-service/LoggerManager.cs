/*----------------------------------------------------------------------------*/
/* Source File:   LOGGERMANAGER.CS                                            */
/* Description:   Implementation for a ILoggerManager Interface.              */
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

using Account.Owner.Service.Interfaces;
using NLog;

namespace Account.Owner.Service
{
    /// <summary>
    /// Implementation for a ILoggerManager Interface.
    /// </summary>
    public class LoggerManager : ILoggerManager
    {
        private static ILogger logger = LogManager.GetCurrentClassLogger();

        /// <summary>
        /// Writes to log an Information level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        public void Info(string message) {
            logger.Info(message);
        }

        /// <summary>
        /// Writes to log an Warning level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        public void Warn(string message) {
            logger.Warn(message);
        }

        /// <summary>
        /// Writes to log an Debugging level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        public void Debug(string message) {
            logger.Debug(message);
        }

        /// <summary>
        /// Writes to log an Error level message.
        /// </summary>
        /// <param name="message">Information to log</param>
        public void Error(string message) {
            logger.Error(message);
        }
    }
}
